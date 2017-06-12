package com.bbva.service.impl;

import com.bbva.component.DockerfileConverter;
import com.bbva.entity.Dockerfile;
import com.bbva.model.DockerfileModel;
import com.bbva.repository.DockerfileRepository;
import com.bbva.service.DockerfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jorge on 12/6/17.
 */

@Service
public class DockerfileServiceImpl implements DockerfileService {

    @Autowired
    private DockerfileRepository dockerfileRepository;

    @Autowired
    private DockerfileConverter dockerfileConverter;

    @Override
    public DockerfileModel addDockerfile(DockerfileModel dockerfileModel) {
        Dockerfile dockerfile = dockerfileConverter.model2entity(dockerfileModel);
        dockerfileRepository.save(dockerfile);
        return dockerfileConverter.entity2model(dockerfile);
    }

    @Override
    public DockerfileModel findDockerfileById(int id) {
        Dockerfile dockerfile = dockerfileRepository.findDockerfileById(id);
        return dockerfileConverter.entity2model(dockerfile);
    }

    @Override
    public List<DockerfileModel> listAllDockerfile() {
        List<Dockerfile> dockerfiles = dockerfileRepository.findAll();
        List<DockerfileModel> dockerfileModels = new ArrayList<DockerfileModel>();
        for (Dockerfile dockerfile : dockerfiles) {
            dockerfileModels.add(dockerfileConverter.entity2model(dockerfile));
        }
        return dockerfileModels;
    }

    @Override
    public void removeDockerfile(int id) {
        dockerfileRepository.delete(dockerfileConverter.model2entity(findDockerfileById(id)));
    }
}
