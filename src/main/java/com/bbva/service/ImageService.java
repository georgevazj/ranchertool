package com.bbva.service;

import com.bbva.model.ImageModel;

import java.util.List;

/**
 * Created by Jorge on 9/6/17.
 */
public interface ImageService {

    public abstract ImageModel addImage(ImageModel imageModel);
    public abstract ImageModel findImageByName(String name);
    public abstract ImageModel findImageById(int id);
    public abstract List<ImageModel> listAllImages();
    public abstract void removeImage(int id);


}
