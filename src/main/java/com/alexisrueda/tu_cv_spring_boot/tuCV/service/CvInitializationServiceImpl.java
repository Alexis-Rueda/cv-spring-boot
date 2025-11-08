package com.alexisrueda.tu_cv_spring_boot.tuCV.service;

import com.alexisrueda.tu_cv_spring_boot.tuCV.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CvInitializationServiceImpl implements CvInitializationService{

    @Override
    public CvData initilizeCvData() {
        CvData cvData = new CvData();

        //Datos personales
        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setFirstName("Alexis");
        personalDetails.setLastName("Rueda");
        personalDetails.setEmail("alexis@gmail.com");
        personalDetails.setProfessionalProfile("Desarrollador Backend");

        cvData.setPersonalDetails(personalDetails);

        //Educación

        Education education1 = new Education();
        education1.setInstitution("Universidad Virtual del Estado de Guanajuato");
        education1.setDescription("Description...");
        education1.setDegree("Bachelor of Science in Computer Science");
        education1.setPeriod("2024 - 2027");

        cvData.setEducations(Collections.singletonList(education1));

        //Experiencia
        Experience experience1 = new Experience();
        experience1.setJobTitle("Senior Developer");
        experience1.setCompany("Sharing Economy Tools - Evertec");
        experience1.setPeriod("2022 - Present");

        cvData.setExperiences(List.of(experience1));

        //Habilidades

        Skill skill1 = new Skill();
        skill1.setName("Java");
        skill1.setLevel("Advanced");

        Skill skill2 = new Skill();
        skill2.setName("Spring Framework");
        skill2.setLevel("Advanced");

        cvData.setSkills(Arrays.asList(skill1, skill2));

        return cvData;
    }
}
