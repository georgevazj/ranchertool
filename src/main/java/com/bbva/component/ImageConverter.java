package com.bbva.component;

import com.bbva.entity.Image;
import com.bbva.model.ImageModel;
import org.springframework.stereotype.Component;

/**
 * Created by Jorge on 9/6/17.
 */

@Component
public class ImageConverter {

    public Image model2entity(ImageModel imageModel){
        Image image = new Image();

        image.setName(imageModel.getName());
        image.setVersion(imageModel.getVersion());
        image.setDescription(imageModel.getDescription());

        return image;
    }

    public ImageModel entity2model(Image image) {
        ImageModel imageModel = new ImageModel();

        imageModel.setName(image.getName());
        imageModel.setVersion(image.getVersion());
        imageModel.setDescription(image.getDescription());

        return imageModel;
    }

}
