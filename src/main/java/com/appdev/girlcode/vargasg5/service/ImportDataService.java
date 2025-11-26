package com.appdev.girlcode.vargasg5.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdev.girlcode.vargasg5.dto.ImportDataDTO;
import com.appdev.girlcode.vargasg5.dto.ImportDataResponseDTO;
import com.appdev.girlcode.vargasg5.entity.ImportDataEntity;
import com.appdev.girlcode.vargasg5.repository.ImportDataRepository;

@Service
public class ImportDataService {

    @Autowired
    private ImportDataRepository importDataRepo;

    public ImportDataService(ImportDataRepository importDataRepo) {
        this.importDataRepo = importDataRepo;
    }

    // C - CREATE
    public ImportDataResponseDTO createImportData(ImportDataDTO dto) {
        ImportDataEntity entity = convertToEntity(dto);
        ImportDataEntity savedEntity = importDataRepo.save(entity);
        return convertToResponseDTO(savedEntity);
    }

    // R - READ ALL
    public List<ImportDataResponseDTO> getAllImportData() {
        List<ImportDataEntity> entities = importDataRepo.findAll();
        return entities.stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    // R - READ BY ID
    public ImportDataResponseDTO getImportDataById(Long id) {
        ImportDataEntity entity = importDataRepo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Import data with ID " + id + " not found!"));
        return convertToResponseDTO(entity);
    }

    // U - UPDATE
    public ImportDataResponseDTO updateImportData(Long id, ImportDataDTO dto) {
        ImportDataEntity existingEntity = importDataRepo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Import data with ID " + id + " not found!"));

        // Update fields
        existingEntity.setNumber(dto.getNumber());
        existingEntity.setOfferingDept(dto.getOfferingDept());
        existingEntity.setSubject(dto.getSubject());
        existingEntity.setSubjectTitle(dto.getSubjectTitle());
        existingEntity.setCreditedUnits(dto.getCreditedUnits());
        existingEntity.setSection(dto.getSection());
        existingEntity.setSchedule(dto.getSchedule());
        existingEntity.setRoom(dto.getRoom());
        existingEntity.setTotalSlots(dto.getTotalSlots());
        existingEntity.setEnrolled(dto.getEnrolled());
        existingEntity.setAssessed(dto.getAssessed());
        if (dto.getIsClosed() != null) {
            existingEntity.setIsClosed(dto.getIsClosed());
        }

        ImportDataEntity updatedEntity = importDataRepo.save(existingEntity);
        return convertToResponseDTO(updatedEntity);
    }

    // D - DELETE
    public String deleteImportData(Long id) {
        if (!importDataRepo.existsById(id)) {
            throw new NoSuchElementException("Import data with ID " + id + " not found!");
        }
        importDataRepo.deleteById(id);
        return "Import data with ID " + id + " successfully deleted!";
    }

    // Helper method to convert DTO to Entity
    private ImportDataEntity convertToEntity(ImportDataDTO dto) {
        ImportDataEntity entity = new ImportDataEntity();
        entity.setNumber(dto.getNumber());
        entity.setOfferingDept(dto.getOfferingDept());
        entity.setSubject(dto.getSubject());
        entity.setSubjectTitle(dto.getSubjectTitle());
        entity.setCreditedUnits(dto.getCreditedUnits());
        entity.setSection(dto.getSection());
        entity.setSchedule(dto.getSchedule());
        entity.setRoom(dto.getRoom());
        entity.setTotalSlots(dto.getTotalSlots());
        entity.setEnrolled(dto.getEnrolled());
        entity.setAssessed(dto.getAssessed());
        entity.setIsClosed(dto.getIsClosed());
        return entity;
    }

    // Helper method to convert Entity to Response DTO
    private ImportDataResponseDTO convertToResponseDTO(ImportDataEntity entity) {
        ImportDataResponseDTO dto = new ImportDataResponseDTO();
        dto.setDataId(entity.getDataId());
        dto.setNumber(entity.getNumber());
        dto.setOfferingDept(entity.getOfferingDept());
        dto.setSubject(entity.getSubject());
        dto.setSubjectTitle(entity.getSubjectTitle());
        dto.setCreditedUnits(entity.getCreditedUnits());
        dto.setSection(entity.getSection());
        dto.setSchedule(entity.getSchedule());
        dto.setRoom(entity.getRoom());
        dto.setTotalSlots(entity.getTotalSlots());
        dto.setEnrolled(entity.getEnrolled());
        dto.setAssessed(entity.getAssessed());
        dto.setIsClosed(entity.getIsClosed());
        return dto;
    }
}
