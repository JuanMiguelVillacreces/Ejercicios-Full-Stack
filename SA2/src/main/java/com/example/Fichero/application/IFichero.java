package com.example.Fichero.application;

import java.nio.file.Path;
import java.util.stream.Stream;

import com.example.Fichero.domain.FileInfo;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;
public interface IFichero {
    public void init(Path root);
    public void save(MultipartFile file);
    public Resource load(String filename);
    public void deleteAll();
    public Stream<Path> loadAll();
    public FileInfo add(FileInfo f);
}