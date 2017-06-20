package com.bbva.component;

import com.bbva.entity.Dockerservice;
import com.bbva.model.DockerserviceModel;
import org.springframework.stereotype.Component;

/**
 * Created by Jorge on 20/6/17.
 */

@Component
public class DockerserviceConverter {

    public DockerserviceModel entity2model (Dockerservice dockerservice) {
        DockerserviceModel dockerserviceModel = new DockerserviceModel();

        dockerserviceModel.setImage(dockerservice.getImage());
        dockerserviceModel.setEntrypoint(dockerservice.getEntrypoint());
        dockerserviceModel.setServicename(dockerservice.getServicename());
        dockerserviceModel.setStdin_open(dockerservice.isStdin_open());
        dockerserviceModel.setTty(dockerservice.isTty());
        dockerserviceModel.setWorkingdir(dockerservice.getWorkingdir());

        return dockerserviceModel;
    }

    public Dockerservice model2entity (DockerserviceModel dockerserviceModel){
        Dockerservice dockerservice = new Dockerservice();

        dockerservice.setServicename(dockerserviceModel.getServicename());
        dockerservice.setWorkingdir(dockerserviceModel.getWorkingdir());
        dockerservice.setTty(dockerserviceModel.isTty());
        dockerservice.setStdin_open(dockerserviceModel.isStdin_open());
        dockerservice.setEntrypoint(dockerserviceModel.getEntrypoint());
        dockerservice.setImage(dockerserviceModel.getImage());

        return dockerservice;
    }

}
