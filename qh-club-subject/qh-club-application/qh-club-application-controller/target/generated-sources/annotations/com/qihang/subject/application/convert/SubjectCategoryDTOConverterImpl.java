package com.qihang.subject.application.convert;

import com.qihang.subject.application.dto.SubjectCategoryDTO;
import com.qihang.subject.domain.entity.SubjectCategoryBo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-27T10:18:37+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
public class SubjectCategoryDTOConverterImpl implements SubjectCategoryDTOConverter {

    @Override
    public SubjectCategoryBo covertBOTocategory(SubjectCategoryDTO subjectCategoryDTO) {
        if ( subjectCategoryDTO == null ) {
            return null;
        }

        SubjectCategoryBo subjectCategoryBo = new SubjectCategoryBo();

        subjectCategoryBo.setId( subjectCategoryDTO.getId() );
        subjectCategoryBo.setCategoryName( subjectCategoryDTO.getCategoryName() );
        subjectCategoryBo.setCategoryType( subjectCategoryDTO.getCategoryType() );
        subjectCategoryBo.setImageUrl( subjectCategoryDTO.getImageUrl() );
        subjectCategoryBo.setParentId( subjectCategoryDTO.getParentId() );

        return subjectCategoryBo;
    }
}
