package com.bbva.service.impl;

import com.bbva.component.ImageConverter;
import com.bbva.entity.Image;
import com.bbva.model.ImageModel;
import com.bbva.repository.ImageRepository;
import com.bbva.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jorge on 9/6/17.
 */

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private ImageConverter imageConverter;


    @Override
    public ImageModel addImage(ImageModel imageModel) {
        Image image = imageConverter.model2entity(imageModel);
        imageRepository.save(image);
        return imageConverter.entity2model(image);
    }

    @Override
    public ImageModel findImageByName(String name) {
        return imageConverter.entity2model(imageRepository.findImageByName(name));
    }

    @Override
    public ImageModel findImageById(int id) {
        Image image = imageRepository.findImageById(id);
        return imageConverter.entity2model(image);
    }

    @Override
    public List<ImageModel> listAllImages() {
        List<Image> images = imageRepository.findAll();
        List<ImageModel> imageModels = new ArrayList<ImageModel>();

        for (Image image:images){
            imageModels.add(imageConverter.entity2model(image));
        }
        return imageModels;
    }

    @Override
    public void removeImage(int id) {
        Image image = imageConverter.model2entity(findImageById(id));
        if (image != null){
            imageRepository.delete(image);
        }
    }
}
