package com.qihang.subject.domain.convert;

import com.qihang.subject.domain.entity.SubjectCategoryBo;
import com.qihang.subject.infrastructure.basic.entity.SubjectCategory;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-27T10:18:36+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
public class SubjectCategoryConverterImpl implements SubjectCategoryConverter {

    @Override
    public SubjectCategory covertBOTocategory(SubjectCategoryBo subjectCategoryBo) {
        if ( subjectCategoryBo == null ) {
            return null;
        }

        SubjectCategory subjectCategory = new SubjectCategory();

        subjectCategory.setId( subjectCategoryBo.getId() );
        subjectCategory.setCategoryName( subjectCategoryBo.getCategoryName() );
        subjectCategory.setCategoryType( subjectCategoryBo.getCategoryType() );
        subjectCategory.setImageUrl( subjectCategoryBo.getImageUrl() );
        subjectCategory.setParentId( subjectCategoryBo.getParentId() );

        return subjectCategory;
    }
}
