package com.RestfulAPI.com.RestfulAPI;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
        private final SoftwareEngineerRepository softwareEngineerRepository;

        public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
            this.softwareEngineerRepository = softwareEngineerRepository;
        }

        public List<SoftwareEngineer> getAllSoftwareEngineers() {
            return softwareEngineerRepository.findAll();
        }

    public void insertSoftwareEngineer(
            SoftwareEngineer softwareEngineer) {
softwareEngineerRepository.save(softwareEngineer);

    }


    public List<SoftwareEngineer> getSoftwareEngineersById(
            Integer id) {
        return softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "Software Engineer with id " + id + " does not exist"));
    }
}


