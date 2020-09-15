package com.spring.henallux.firstSpringProject.dataAccess.dao;

import com.spring.henallux.firstSpringProject.dataAccess.entity.MagicKeyEntity;
import com.spring.henallux.firstSpringProject.dataAccess.repository.MagicKeyRepository;
import com.spring.henallux.firstSpringProject.dataAccess.util.ProviderConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MagicKeyDAO {

    private MagicKeyRepository magicKeyRepository;
    private ProviderConverter providerConverter;

    @Autowired
    public MagicKeyDAO(MagicKeyRepository magicKeyRepository, ProviderConverter providerConverter) {
        this.magicKeyRepository = magicKeyRepository;
        this.providerConverter = providerConverter;
    }

    public String save(String magicKeyForm) {
        MagicKeyEntity magicKeyEntity = providerConverter.FormToEntity(magicKeyForm);
        magicKeyEntity = magicKeyRepository.save(magicKeyEntity);
        return providerConverter.EntityToForm(magicKeyEntity);
    }

    public ArrayList<String> getMagicKeys() {
        List <MagicKeyEntity> magicKeyEntities = magicKeyRepository.findAll();
        ArrayList <String> magicKeyForms = new ArrayList<>();
        for (MagicKeyEntity entity : magicKeyEntities)
            {String magicKeyForm = providerConverter.EntityToForm(entity);
            magicKeyForms.add(magicKeyForm);}
        return magicKeyForms;
    }

}
