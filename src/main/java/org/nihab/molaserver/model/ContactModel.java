package org.nihab.molaserver.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class ContactModel {
    @Id
    private String id;
    private String contactName;
    private List<MolaModel> identifications;
}
