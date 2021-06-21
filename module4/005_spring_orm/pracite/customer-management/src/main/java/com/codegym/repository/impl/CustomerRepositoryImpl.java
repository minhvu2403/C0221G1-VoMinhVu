package com.codegym.repository.impl;

import com.codegym.entity.Customer;
import com.codegym.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> typedQuery =
                ConnectionDB.entityManager.createQuery("select cm from customer cm", Customer.class);

        return typedQuery.getResultList();
    }

    @Override
    public void save(Customer customer) {
        EntityTransaction entityTransaction = ConnectionDB.entityManager.getTransaction();
        entityTransaction.begin();
        ConnectionDB.entityManager.persist(customer);
        entityTransaction.commit();
    }

    @Override
    public Customer findById(Integer id) {
        return ConnectionDB.entityManager.find(Customer.class, id);

    }

    @Override
    public void update( Customer customer) {
        EntityTransaction entityTransaction = ConnectionDB.entityManager.getTransaction();
        entityTransaction.begin();
        ConnectionDB.entityManager.merge(customer);
        entityTransaction.commit();

    }

    @Override
    public void remove(Integer id) {
        EntityTransaction entityTransaction = ConnectionDB.entityManager.getTransaction();
        entityTransaction.begin();
        ConnectionDB.entityManager.remove(findById(id));
        entityTransaction.commit();
    }
}
