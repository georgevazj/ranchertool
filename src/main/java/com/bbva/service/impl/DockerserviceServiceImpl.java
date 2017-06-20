package com.bbva.service.impl;

import com.bbva.component.DockerserviceConverter;
import com.bbva.entity.Dockerservice;
import com.bbva.model.DockerserviceModel;
import com.bbva.repository.DockerserviceRepository;
import com.bbva.service.DockerserviceService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jorge on 20/6/17.
 */

@Service
public class DockerserviceServiceImpl implements DockerserviceService {

    private static final Log LOG = LogFactory.getLog(DockerserviceServiceImpl.class);

    @Autowired
    private DockerserviceRepository dockerserviceRepository;

    @Autowired
    private DockerserviceConverter dockerserviceConverter;


    @Override
    public DockerserviceModel addDockerservice(DockerserviceModel dockerserviceModel) {
        Dockerservice dockerservice = dockerserviceConverter.model2entity(dockerserviceModel);
        return dockerserviceConverter.entity2model(dockerserviceRepository.save(dockerservice));
    }

    @Override
    public DockerserviceModel findDockerserviceById(int id) {
        return dockerserviceConverter.entity2model(dockerserviceRepository.findDockerserviceById(id));
    }

    @Override
    public List<DockerserviceModel> listAllDockerservice() {
        List<Dockerservice> dockerservices = dockerserviceRepository.findAll();
        List<DockerserviceModel> dockerserviceModels = new ArrayList<DockerserviceModel>();
        for (Dockerservice dockerservice : dockerservices){
            dockerserviceModels.add(dockerserviceConverter.entity2model(dockerservice));
        }
        return dockerserviceModels;
    }

    @Override
    public void removeDockerservice(int id) {
        dockerserviceRepository.delete(dockerserviceConverter.model2entity(findDockerserviceById(id)));
    }
}
