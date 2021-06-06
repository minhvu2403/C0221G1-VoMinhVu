package model.service.service;

import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;
import model.repository.ServiceRepository;

import java.util.List;

public class ServiceImp implements IEService {
    ServiceRepository serviceRepository= new ServiceRepository();

    @Override
    public boolean add(Service service) {
      return  serviceRepository.add(service);

    }

    @Override
    public List<RentType> findAllRentType() {
        return serviceRepository.findAllRentType();
    }

    @Override
    public List<ServiceType> findAllServiceType() {
        return serviceRepository.findAllServiceType();
    }

    @Override
    public List<Service> findByAll() {
        return serviceRepository.findByAll();
    }
}
