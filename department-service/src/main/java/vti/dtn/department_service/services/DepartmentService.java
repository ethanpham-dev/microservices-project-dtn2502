package vti.dtn.department_service.services;

import vti.dtn.department_service.dto.DepartmentDTO;

import java.util.List;

public interface DepartmentService {
    List<DepartmentDTO> getAllDepartments();
}
