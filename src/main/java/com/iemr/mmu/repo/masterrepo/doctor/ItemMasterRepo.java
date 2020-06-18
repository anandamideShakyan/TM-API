package com.iemr.mmu.repo.masterrepo.doctor;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.mmu.data.masterdata.doctor.ItemMaster;
import com.iemr.mmu.data.masterdata.doctor.V_DrugPrescription;

@Repository
public interface ItemMasterRepo extends CrudRepository<ItemMaster, Long> {
	@Query("SELECT t FROM ItemMaster t WHERE t.providerServiceMapID= :psmID and t.isEDL = true ")
	public ArrayList<Object[]> searchEdl(@Param("psmID") Integer psmID);
}
