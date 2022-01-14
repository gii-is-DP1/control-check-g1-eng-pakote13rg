package org.springframework.samples.petclinic.vacination;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationService {
	
	@Autowired
	private VaccinationRepository ps;
	
    public List<Vaccination> getAll(){
        return ps.findAll();
    }

    public List<Vaccine> getAllVaccines(){
        return ps.findAllVaccines();
    }

    public Vaccine getVaccine(String typeName) {
        return ps.findVaccineByName(typeName);
    }

    public Vaccination save(Vaccination p) throws UnfeasibleVaccinationException {
    	return ps.save(p);    
    }

    
}
