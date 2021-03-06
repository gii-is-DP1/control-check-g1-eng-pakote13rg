package org.springframework.samples.petclinic.vacination;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Vaccine extends BaseEntity{
	@NotNull
	@Size(min=3,max=50)
    String name;
	
	@NotNull
	@Min(0)
    double price;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name="pet_type_id")
    PetType petType;
}
