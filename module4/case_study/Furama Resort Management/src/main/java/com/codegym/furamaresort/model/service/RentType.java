package com.codegym.furamaresort.model.service;

import com.codegym.furamaresort.TypeCommon;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "rent_type")
public class RenType extends TypeCommon {

    @OneToMany(mappedBy = "rentType", cascade = CascadeType.ALL)
    @JsonBackReference

    private Set<Service> serviceSet;

    public RenType() {

    }
    public Set<Service> getServiceSet() {
        return serviceSet;
    }

    public void setServiceSet(Set<Service> serviceSet) {
        this.serviceSet = serviceSet;
    }
}
