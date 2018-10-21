/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductDirectoryApiServiceImpl implements ProductDirectoryApiService {

	public ProductDirectoryRecordResponse record(String crReferenceId, ProductDirectoryRecordRequest request){
		return JsonReader.read("record-ProductDirectoryRecordResponse.json",new TypeReference<ProductDirectoryRecordResponse>(){});
	}
	
	public ProductDirectoryProductionBaseWithIds registerAtProductions(String crReferenceId, ProductDirectoryProductionBase request){
		return JsonReader.read("registerAt-ProductDirectoryProductionBaseWithIds.json",new TypeReference<ProductDirectoryProductionBaseWithIds>(){});
	}
	
	public ProductDirectorySalesMarketingBaseWithIds registerAtSalesMarketings(String crReferenceId, ProductDirectorySalesMarketingBase request){
		return JsonReader.read("registerAt-ProductDirectorySalesMarketingBaseWithIds.json",new TypeReference<ProductDirectorySalesMarketingBaseWithIds>(){});
	}
	
	public ProductDirectoryServicingBaseWithIds registerAtServicings(String crReferenceId, ProductDirectoryServicingBase request){
		return JsonReader.read("registerAt-ProductDirectoryServicingBaseWithIds.json",new TypeReference<ProductDirectoryServicingBaseWithIds>(){});
	}
	
	public ProductDirectorySuitabilityBaseWithIds registerAtSuitabilities(String crReferenceId, ProductDirectorySuitabilityBase request){
		return JsonReader.read("registerAt-ProductDirectorySuitabilityBaseWithIds.json",new TypeReference<ProductDirectorySuitabilityBaseWithIds>(){});
	}
	
	public ProductDirectoryOperationBaseWithIds registerAtOperations(String crReferenceId, ProductDirectoryOperationBase request){
		return JsonReader.read("registerAt-ProductDirectoryOperationBaseWithIds.json",new TypeReference<ProductDirectoryOperationBaseWithIds>(){});
	}
	
	public ProductDirectoryEntryRefreshResponse requestPut(String crReferenceId){
		return JsonReader.read("requestPut-ProductDirectoryEntryRefreshResponse.json",new TypeReference<ProductDirectoryEntryRefreshResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ProductDirectorySalesMarketingBaseWithIds retrieveSalesMarketings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProductDirectorySalesMarketingBaseWithIds.json",new TypeReference<ProductDirectorySalesMarketingBaseWithIds>(){});
	}
	
	public ProductDirectoryOperationBaseWithIds retrieveOperations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProductDirectoryOperationBaseWithIds.json",new TypeReference<ProductDirectoryOperationBaseWithIds>(){});
	}
	
	public ProductDirectoryProductionBaseWithIds retrieveProductions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProductDirectoryProductionBaseWithIds.json",new TypeReference<ProductDirectoryProductionBaseWithIds>(){});
	}
	
	public ProductDirectoryRecordBaseWithIds retrieveRecords(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProductDirectoryRecordBaseWithIds.json",new TypeReference<ProductDirectoryRecordBaseWithIds>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ProductDirectoryServicingBaseWithIds retrieveServicings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProductDirectoryServicingBaseWithIds.json",new TypeReference<ProductDirectoryServicingBaseWithIds>(){});
	}
	
	public ProductDirectorySuitabilityBaseWithIds retrieveSuitabilities(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProductDirectorySuitabilityBaseWithIds.json",new TypeReference<ProductDirectorySuitabilityBaseWithIds>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public ProductDirectoryRecordBaseWithIds updateRecords(String crReferenceId, String bqReferenceId, ProductDirectoryRecordBase request){
		return JsonReader.read("update-ProductDirectoryRecordBaseWithIds.json",new TypeReference<ProductDirectoryRecordBaseWithIds>(){});
	}
	
	public ProductDirectoryOperationBaseWithIds updateOperations(String crReferenceId, String bqReferenceId, ProductDirectoryOperationBase request){
		return JsonReader.read("update-ProductDirectoryOperationBaseWithIds.json",new TypeReference<ProductDirectoryOperationBaseWithIds>(){});
	}
	
	public ProductDirectoryProductionBaseWithIds updateProductions(String crReferenceId, String bqReferenceId, ProductDirectoryProductionBase request){
		return JsonReader.read("update-ProductDirectoryProductionBaseWithIds.json",new TypeReference<ProductDirectoryProductionBaseWithIds>(){});
	}
	
	public ProductDirectorySalesMarketingBaseWithIds updateSalesMarketings(String crReferenceId, String bqReferenceId, ProductDirectorySalesMarketingBase request){
		return JsonReader.read("update-ProductDirectorySalesMarketingBaseWithIds.json",new TypeReference<ProductDirectorySalesMarketingBaseWithIds>(){});
	}
	
	public ProductDirectoryServicingBaseWithIds updateServicings(String crReferenceId, String bqReferenceId, ProductDirectoryServicingBase request){
		return JsonReader.read("update-ProductDirectoryServicingBaseWithIds.json",new TypeReference<ProductDirectoryServicingBaseWithIds>(){});
	}
	
	public ProductDirectorySuitabilityBaseWithIds updateSuitabilities(String crReferenceId, String bqReferenceId, ProductDirectorySuitabilityBase request){
		return JsonReader.read("update-ProductDirectorySuitabilityBaseWithIds.json",new TypeReference<ProductDirectorySuitabilityBaseWithIds>(){});
	}
	
}
