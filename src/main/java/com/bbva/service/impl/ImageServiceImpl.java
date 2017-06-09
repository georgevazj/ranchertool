package com.bbva.service.impl;

import com.bbva.component.ImageConverter;
import com.bbva.entity.Image;
import com.bbva.model.ImageModel;
import com.bbva.repository.ImageRepository;
import com.bbva.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
    }

    @Override
    public List<ImageModel> listAllImages() {
        return null;
    }

    @Override
    public void removeImage(int id) {

    }
}
