package com.born.insurance.web.controller.priceContactLetterDemandDetail;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.born.insurance.web.controller.base.BaseController;
import com.born.insurance.ws.order.priceContactLetterDemandDetail.PriceContactLetterDemandDetailOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.born.insurance.web.util.PageUtil;
import com.born.insurance.web.util.WebUtil;
import com.born.insurance.ws.info.priceContactLetterDemandDetail.PriceContactLetterDemandDetailInfo;
import com.born.insurance.ws.order.priceContactLetterDemandDetail.PriceContactLetterDemandDetailQueryOrder;
import com.born.insurance.ws.result.base.InsuranceBaseResult;
import com.born.insurance.ws.result.base.QueryBaseBatchResult;
import org.springframework.web.bind.annotation.ResponseBody;
import com.born.insurance.ws.service.priceContactLetterDemandDetail.PriceContactLetterDemandDetailService;
import org.springframework.beans.factory.annotation.Autowired;

/**
* Created by wqh on 2016-11-18.
*/
@Controller
@RequestMapping("/insurance/priceContactLetterDemandDetail")
public class PriceContactLetterDemandDetailController extends BaseController {
	@Autowired
	protected PriceContactLetterDemandDetailService priceContactLetterDemandDetailService;
	private final static String VM_PATH = "/insurance/priceContactLetterDemandDetail/";

	/**
	* 风险预警处理表
	*
	* @param request
	* @param model
	* @return
	*/
	@RequestMapping("list.htm")
	public String list(HttpServletRequest request, Model model) {
		try {
			PriceContactLetterDemandDetailQueryOrder queryOrder = new PriceContactLetterDemandDetailQueryOrder();
			WebUtil.setPoPropertyByRequest(queryOrder, request);
			setSessionLocalInfo2Order(queryOrder);
			QueryBaseBatchResult<PriceContactLetterDemandDetailInfo> batchResult = priceContactLetterDemandDetailService.queryList(queryOrder);
			model.addAttribute("page", PageUtil.getCovertPage(batchResult));
			model.addAttribute("queryConditions", queryOrder);
		} catch (Exception e) {
			logger.error("查询出错",e);
		}
			return VM_PATH + "listPriceContactLetterDemandDetail.vm";
	}

    @RequestMapping("edit.htm")
    public String edit(	@RequestParam(value = "id", required = false, defaultValue = "0") long id,
    HttpServletRequest request, Model model) {
		PriceContactLetterDemandDetailInfo info = null;
		if (id > 0) {
			info = priceContactLetterDemandDetailService.findById(id);
			model.addAttribute("info", info);
	    }else{
			info = new PriceContactLetterDemandDetailInfo();
			model.addAttribute("info", info);
		}
		return VM_PATH + "addPriceContactLetterDemandDetail.vm";
	}

	@ResponseBody
	@RequestMapping("editSubmit.json")
	public Object editSubmit(HttpServletRequest request, PriceContactLetterDemandDetailOrder order) {
		JSONObject json = new JSONObject();

		String tipPrefix = "priceContactLetterDemandDetail";
		try {
			setSessionLocalInfo2Order(order);
			InsuranceBaseResult result = priceContactLetterDemandDetailService.save(order);
			json = toJSONResult(result, tipPrefix);
		} catch (Exception e) {
			logger.error(tipPrefix, e);
			json = toJSONResult(tipPrefix, e);
		}
		return json;
    }

    @RequestMapping("view.htm")
    public String view(long id, HttpServletRequest request, Model model) {
		PriceContactLetterDemandDetailInfo priceContactLetterDemandDetailInfo = priceContactLetterDemandDetailService.findById(id);
		model.addAttribute("info",priceContactLetterDemandDetailInfo);
		return VM_PATH + "viewPriceContactLetterDemandDetail.vm";
    }


}
