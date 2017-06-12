package com.bbva.service;

import com.bbva.model.DockerfileModel;

import java.util.List;

/**
 * Created by Jorge on 12/6/17.
 */
public interface DockerfileService {

    public abstract DockerfileModel addDockerfile(DockerfileModel dockerfileModel);
    public abstract DockerfileModel findDockerfileById(int id);
    public abstract List<DockerfileModel> listAllDockerfile();
    public abstract void removeDockerfile(int id);


}
