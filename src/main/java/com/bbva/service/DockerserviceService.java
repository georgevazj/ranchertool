package com.bbva.service;

import com.bbva.model.DockerserviceModel;

import java.util.List;

/**
 * Created by Jorge on 20/6/17.
 */
public interface DockerserviceService {

    public abstract DockerserviceModel addDockerservice(DockerserviceModel dockerserviceModel);
    public abstract DockerserviceModel findDockerserviceById(int id);
    public abstract List<DockerserviceModel> listAllDockerservice();
    public abstract void removeDockerservice(int id);

}
