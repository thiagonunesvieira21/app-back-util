package br.com.util.utilities;

import java.util.List;

import org.hibernate.Criteria;

public class MyHibernateUtils {
	
	public static <T> List<T> listAndCast(Criteria c) {
	    @SuppressWarnings("unchecked")
	    List<T> list = c.list();
	    return list;
	}

}
