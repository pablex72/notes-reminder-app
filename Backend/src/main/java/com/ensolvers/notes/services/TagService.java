package com.ensolvers.notes.services;

import com.ensolvers.notes.dto.TagDTO;
import com.ensolvers.notes.models.Tag;

import java.util.List;
import java.util.Optional;

public interface TagService {
    Tag findTag(String name);

    Optional<Tag> findTag(Integer id);

    void createTag(TagDTO tagDTO);

    List<TagDTO> getTags();

    void deleteTag(Tag tag);
}
