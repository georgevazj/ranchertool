package com.bbva.component;

import com.bbva.entity.Dockerfile;
import com.bbva.model.DockerfileModel;
import org.springframework.stereotype.Component;

/**
 * Created by Jorge on 12/6/17.
 */

@Component
public class DockerfileConverter {

    public Dockerfile model2entity(DockerfileModel dockerfileModel){
        Dockerfile dockerfile = new Dockerfile();

        dockerfile.setServicename(dockerfileModel.getServicename());
        dockerfile.setDescription(dockerfileModel.getDescription());
        dockerfile.setPath(dockerfileModel.getPath());
        dockerfile.setUuaa(dockerfileModel.getUuaa());
        dockerfile.setImage(dockerfileModel.getImage());

        return dockerfile;
    }

    public DockerfileModel entity2model(Dockerfile dockerfile){
        DockerfileModel dockerfileModel = new DockerfileModel();

        dockerfileModel.setServicename(dockerfile.getServicename());
        dockerfileModel.setDescription(dockerfile.getDescription());
        dockerfileModel.setImage(dockerfile.getImage());
        dockerfileModel.setUuaa(dockerfile.getUuaa());
        dockerfileModel.setPath(dockerfile.getPath());

        return dockerfileModel;
    }

}
