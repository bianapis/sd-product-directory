/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductDirectoryApiService {

	ProductDirectoryRecordResponse record(String crReferenceId, ProductDirectoryRecordRequest request);
	
	ProductDirectoryProductionBaseWithIds registerAtProductions(String crReferenceId, ProductDirectoryProductionBase request);
	
	ProductDirectorySalesMarketingBaseWithIds registerAtSalesMarketings(String crReferenceId, ProductDirectorySalesMarketingBase request);
	
	ProductDirectoryServicingBaseWithIds registerAtServicings(String crReferenceId, ProductDirectoryServicingBase request);
	
	ProductDirectorySuitabilityBaseWithIds registerAtSuitabilities(String crReferenceId, ProductDirectorySuitabilityBase request);
	
	ProductDirectoryOperationBaseWithIds registerAtOperations(String crReferenceId, ProductDirectoryOperationBase request);
	
	ProductDirectoryEntryRefreshResponse requestPut(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	ProductDirectorySalesMarketingBaseWithIds retrieveSalesMarketings(String crReferenceId, String bqReferenceId);
	
	ProductDirectoryOperationBaseWithIds retrieveOperations(String crReferenceId, String bqReferenceId);
	
	ProductDirectoryProductionBaseWithIds retrieveProductions(String crReferenceId, String bqReferenceId);
	
	ProductDirectoryRecordBaseWithIds retrieveRecords(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	ProductDirectoryServicingBaseWithIds retrieveServicings(String crReferenceId, String bqReferenceId);
	
	ProductDirectorySuitabilityBaseWithIds retrieveSuitabilities(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQs();
	
	ProductDirectoryRecordBaseWithIds updateRecords(String crReferenceId, String bqReferenceId, ProductDirectoryRecordBase request);
	
	ProductDirectoryOperationBaseWithIds updateOperations(String crReferenceId, String bqReferenceId, ProductDirectoryOperationBase request);
	
	ProductDirectoryProductionBaseWithIds updateProductions(String crReferenceId, String bqReferenceId, ProductDirectoryProductionBase request);
	
	ProductDirectorySalesMarketingBaseWithIds updateSalesMarketings(String crReferenceId, String bqReferenceId, ProductDirectorySalesMarketingBase request);
	
	ProductDirectoryServicingBaseWithIds updateServicings(String crReferenceId, String bqReferenceId, ProductDirectoryServicingBase request);
	
	ProductDirectorySuitabilityBaseWithIds updateSuitabilities(String crReferenceId, String bqReferenceId, ProductDirectorySuitabilityBase request);
	
}
