/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Register;

@BianRestController
public class ProductDirectoryApiController {

	@Autowired
	ProductDirectoryApiService service;
	
	@Register.Record
	public BianResponse<ProductDirectoryRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductDirectoryRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("productions")
	@Register.RegisterAt
	public BianResponse<ProductDirectoryProductionBaseWithIds> registerAtProductions(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductDirectoryProductionBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtProductions(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("sales-marketings")
	@Register.RegisterAt
	public BianResponse<ProductDirectorySalesMarketingBaseWithIds> registerAtSalesMarketings(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductDirectorySalesMarketingBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtSalesMarketings(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicings")
	@Register.RegisterAt
	public BianResponse<ProductDirectoryServicingBaseWithIds> registerAtServicings(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductDirectoryServicingBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtServicings(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("suitabilities")
	@Register.RegisterAt
	public BianResponse<ProductDirectorySuitabilityBaseWithIds> registerAtSuitabilities(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductDirectorySuitabilityBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtSuitabilities(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("operations")
	@Register.RegisterAt
	public BianResponse<ProductDirectoryOperationBaseWithIds> registerAtOperations(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProductDirectoryOperationBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtOperations(crReferenceId, bianRequest.getData()));
	}
	
	@Register.RequestPut
	public BianResponse<ProductDirectoryEntryRefreshResponse> requestPut(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId));
	}
	
	@Register.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("sales-marketings")
	@Register.Retrieve
	public BianResponse<ProductDirectorySalesMarketingBaseWithIds> retrieveSalesMarketings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSalesMarketings(crReferenceId, bqReferenceId));
	}
	
	@BQ("operations")
	@Register.Retrieve
	public BianResponse<ProductDirectoryOperationBaseWithIds> retrieveOperations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOperations(crReferenceId, bqReferenceId));
	}
	
	@BQ("productions")
	@Register.Retrieve
	public BianResponse<ProductDirectoryProductionBaseWithIds> retrieveProductions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductions(crReferenceId, bqReferenceId));
	}
	
	@BQ("records")
	@Register.Retrieve
	public BianResponse<ProductDirectoryRecordBaseWithIds> retrieveRecords(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRecords(crReferenceId, bqReferenceId));
	}
	
	@Register.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("servicings")
	@Register.Retrieve
	public BianResponse<ProductDirectoryServicingBaseWithIds> retrieveServicings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicings(crReferenceId, bqReferenceId));
	}
	
	@BQ("suitabilities")
	@Register.Retrieve
	public BianResponse<ProductDirectorySuitabilityBaseWithIds> retrieveSuitabilities(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSuitabilities(crReferenceId, bqReferenceId));
	}
	
	@Register.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("records")
	@Register.Update
	public BianResponse<ProductDirectoryRecordBaseWithIds> updateRecords(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ProductDirectoryRecordBase> bianRequest) {
		return BianResponse.forSuccess(service.updateRecords(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("operations")
	@Register.Update
	public BianResponse<ProductDirectoryOperationBaseWithIds> updateOperations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ProductDirectoryOperationBase> bianRequest) {
		return BianResponse.forSuccess(service.updateOperations(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productions")
	@Register.Update
	public BianResponse<ProductDirectoryProductionBaseWithIds> updateProductions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ProductDirectoryProductionBase> bianRequest) {
		return BianResponse.forSuccess(service.updateProductions(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sales-marketings")
	@Register.Update
	public BianResponse<ProductDirectorySalesMarketingBaseWithIds> updateSalesMarketings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ProductDirectorySalesMarketingBase> bianRequest) {
		return BianResponse.forSuccess(service.updateSalesMarketings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicings")
	@Register.Update
	public BianResponse<ProductDirectoryServicingBaseWithIds> updateServicings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ProductDirectoryServicingBase> bianRequest) {
		return BianResponse.forSuccess(service.updateServicings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("suitabilities")
	@Register.Update
	public BianResponse<ProductDirectorySuitabilityBaseWithIds> updateSuitabilities(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ProductDirectorySuitabilityBase> bianRequest) {
		return BianResponse.forSuccess(service.updateSuitabilities(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
