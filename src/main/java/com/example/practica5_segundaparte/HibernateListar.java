package com.example.practica5_segundaparte;

import com.example.practica5_segundaparte.model.Cliente;
import com.example.practica5_segundaparte.utilidades.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class HibernateListar {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        List<Cliente> clientes = em.createQuery("select c from Cliente c", Cliente.class).getResultList();
        clientes.forEach(System.out::println);
        em.close();
    }

}
