package com.appdev.girlcode.vargasg5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdev.girlcode.vargasg5.dto.ImportDataDTO;
import com.appdev.girlcode.vargasg5.dto.ImportDataResponseDTO;
import com.appdev.girlcode.vargasg5.service.ImportDataService;

@RestController
@RequestMapping("/api/import-data")
@CrossOrigin(origins = "*")
public class ImportDataController {

    @Autowired
    private ImportDataService importDataService;

    // CREATE - POST
    @PostMapping
    public ResponseEntity<ImportDataResponseDTO> createImportData(@RequestBody ImportDataDTO dto) {
        ImportDataResponseDTO response = importDataService.createImportData(dto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // READ ALL - GET
    @GetMapping
    public ResponseEntity<List<ImportDataResponseDTO>> getAllImportData() {
        List<ImportDataResponseDTO> dataList = importDataService.getAllImportData();
        return new ResponseEntity<>(dataList, HttpStatus.OK);
    }

    // READ BY ID - GET
    @GetMapping("/{id}")
    public ResponseEntity<ImportDataResponseDTO> getImportDataById(@PathVariable Long id) {
        ImportDataResponseDTO response = importDataService.getImportDataById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // UPDATE - PUT
    @PutMapping("/{id}")
    public ResponseEntity<ImportDataResponseDTO> updateImportData(@PathVariable Long id, 
                                                                   @RequestBody ImportDataDTO dto) {
        ImportDataResponseDTO response = importDataService.updateImportData(id, dto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // DELETE - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteImportData(@PathVariable Long id) {
        String message = importDataService.deleteImportData(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
