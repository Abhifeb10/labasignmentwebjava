package Example.jdbc;

import java.util.Collection;

public interface jdbcDao<T,K>{
//this is a generic interface which provide a basic template for performing 
	//CURD operations.
	Collection<T> getAll();//get all the object of specific type.
	 T getone(K key);//get one object of the specific type based upon its identity.
	 //create
	 void add(T t);//Add a new record into the existing table 
	 void update(T K);
	 //delete
	 void delete(K key);//Delete the specific records against its identity
}
