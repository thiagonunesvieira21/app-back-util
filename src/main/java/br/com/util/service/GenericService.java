package br.com.util.service;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public class GenericService<T, ID extends Serializable> {

    private JpaRepository<T, ID> repository;
    
    public GenericService(JpaRepository<T, ID> repository) {
    	this.repository = repository;
    }
    
    public <S extends T> S save(S entity) {
        return repository.save(entity);
    }
    
    public <S extends T> T findById(ID id) {
        return repository.findOne(id);
    }

	public void delete(ID id) {
		repository.delete(id);
	}
    
    public <S extends T> List<T> findAll() {
        return repository.findAll();
    }
    
    public <S extends T> Page<T> findAll(int page, int size) {
        return repository.findAll(new PageRequest(page, size));
    }
    
    public static void copyNonNullProperties(Object src, Object target) {
	    BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
	}

	public static String[] getNullPropertyNames (Object source) {
	    final BeanWrapper src = new BeanWrapperImpl(source);
	    java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

	    Set<String> emptyNames = new HashSet<String>();
	    for(java.beans.PropertyDescriptor pd : pds) {
	        Object srcValue = src.getPropertyValue(pd.getName());
	        if (srcValue == null) emptyNames.add(pd.getName());
	    }
	    String[] result = new String[emptyNames.size()];
	    return emptyNames.toArray(result);
	}
}