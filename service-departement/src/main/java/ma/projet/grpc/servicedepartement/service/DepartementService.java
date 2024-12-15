package ma.projet.grpc.servicedepartement.service;


import ma.projet.grpc.servicedepartement.entity.Departement;
import ma.projet.grpc.servicedepartement.entity.Enseignant;

import java.util.List;
import java.util.Map;

public interface DepartementService {
    List<Departement> getAllDepartements();
    Departement getDepartementById(Long id);
    Departement createDepartement(Departement departement);
    Departement updateDepartement(Long id, Departement departement);
    void deleteDepartement(Long id);
    List<Enseignant> getEnseignantsByDepartementId(Long departementId);
    Enseignant addEnseignantToDepartement(Long departementId, Enseignant enseignant);
    public Map<String, Integer> getNombreEnseignantsParDepartement();
}
