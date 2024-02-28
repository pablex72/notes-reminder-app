package com.ensolvers.notes.controllers;

import com.ensolvers.notes.dto.TagDTO;
import com.ensolvers.notes.models.Tag;
import com.ensolvers.notes.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/tag")
@CrossOrigin
public class TagController {
    private final TagService tagService;
    @Autowired
    public TagController(TagService tagService){
        this.tagService = tagService;
    }

    @PostMapping("/create")
    public ResponseEntity createTag(@Valid @RequestBody TagDTO tagDTO){
        if (Objects.nonNull(tagService.findTag(tagDTO.getName()))){
            return new ResponseEntity<>("Already exists", HttpStatus.CONFLICT);
        }
        tagService.createTag(tagDTO);
        return new ResponseEntity<>("Successfully created", HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<TagDTO>> getTags(){
        List<TagDTO> tagList = tagService.getTags();
        return new ResponseEntity<>(tagList,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{tagId}")
    public ResponseEntity deleteTag(@PathVariable("tagId") Integer tagId){
        Tag tag = tagService.findTag(tagId).orElse(null);
        if (Objects.nonNull(tag)){
            tagService.deleteTag(tag);
            return new ResponseEntity<>("Deleted successfully",HttpStatus.OK);
        }
        return new ResponseEntity<>("Check the id",HttpStatus.NOT_FOUND);
    }
}
