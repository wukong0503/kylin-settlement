<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>对账结果&分润结果查询</title>

<jsp:include page="../../base/base_page.jsp"></jsp:include>
<jsp:include page="../../base/createIF.jsp"></jsp:include>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/settlement/entry/query.js"></script>
</head>
	<div class="area">
		<form name="dataForm" id="dataForm" method="post" action="${pageContext.request.contextPath}/entry/query_ajax">
			<input type="hidden" id="outputTxtURL" value="${pageContext.request.contextPath}/outputFileController/op_txt_balance_entry" />
			<div class="main">
				<div class="blank15"></div>
				<div class="wrap">
					<div class="con">
						<div class="con_title">
							<h3 class="left fs14 marglr3020">对账结果&分润结果查询</h3>
							<span class="grey"></span>
						</div>
						<div class="main_con" style="display: ">
							<div class="con_article_title tit_zindex3 linehei30">
								<b class="left paddl67 paddr10">内容筛选</b><a href="javascript:;"
									class="margt10 btn_arrow_up" id="reg2_arrow"></a>
							</div>
							<div class="con_article_title02 tit_zindex6" id="reg2_arrow_con">
								<div class="con_article_title02 margt10 tit_zindex5 paddl52"
									style="width:90%">
									<label class="label_txt wid135 txtright margr8 margt11">交易订单号： </label>
									<div class="input_con_type_top wid190 margt4">
										<input type="text" class="wid190" name="orderNo" id="orderNo">
									</div>
									<div class="left wid315 rel_pos paddl52">
										<label
											class="label_txt wid100 txtright margr8 margt11 paddingl_8">
											结果类型： </label>
										<div class="input_con_type_top wid190 margt4">
											<select style="width:189px;height:28px;" name="balanceType">
												<option style="height:25px" value="-1">全部</option>
												<option style="height:25px" value="1">【对账】 外部对账结果 </option>
												<option style="height:25px" value="2">【对账】 账户&多渠道对账结果 </option>
												<option style="height:25px" value="0">【分润】 分润失败结果 </option>
											</select>
										</div>
									</div>
									<div class="left wid315 rel_pos paddl52">
										<label
											class="label_txt wid100 txtright margr8 margt11 paddingl_8">
											状态： </label>
										<div class="input_con_type_top wid190 margt4">
											<select style="width:189px;height:28px;" name="statusId">
												<option style="height:25px" value="-1">全部</option>
												<option style="height:25px" value="1">【对账】 平账</option>
												<option style="height:25px" value="0">【对账】 错账</option>
												<option style="height:25px" value="2">【对账】 长款</option>
												<option style="height:25px" value="3">【对账】 短款</option>
												<option style="height:25px" value="11">【分润】 成功</option>
												<option style="height:25px" value="10">【分润】 失败</option>
											</select>
										</div>
									</div>
								</div>
								<div class="con_article_title02 tit_zindex6" id="reg2_arrow_con"> 
									<div class="con_article_title02 margt10 tit_zindex5 paddl52"
										style="z-index:10;width:90%">
										<label class="label_txt wid135 txtright margr8 margt11">记账日期： </label>
										<div class="input_time_type wid190 margt4">
											<input id="checkStartTime" type="text" readonly="readonly" name="accountDateStr"
												class="wid140 hasDatepicker" value="">
											<a href="javascript:;"
												onclick="WdatePicker({el:'checkStartTime',isShowClear:true,readOnly:true})"
												class="right icon_timer timer_calender margtr36"></a>
										</div>
									</div>
								</div>

								<div class="con_article_title02 margt10 tit_zindex3">
									<a href="javascript:;"
										class="right chan_btn wid60 margr66 margt5"
										onclick="resetForm()">清除</a> 
									<a href="javascript:;"
										onclick="funSearch(1)"
										class="right chan_btn wid60 margr30 margt5">查询</a>
									<!-- 
									<a href="javascript:;"
										class="right chan_btn wid80 margr66 margt5"
										onclick="outputEXCL();">导出Txt</a> -->
								</div>
							</div>

							<div class="bord11 margt10"></div>
							<div class="con_core_info_main wid1125 paddl10 margt10 overflow-ui">
								<table class="chan_table tb_bord01 tb_style" id="user_table1">
								</table>
							</div>
							<div class="left wid500 paddl60 margt10 rel_pos"
								style="height:42px;">
								<label class="label_txt wid60 txtright margr8 margt11">
									每页显示 </label>
								<div class="input_con_type_top wid95 margt4">
									<select style="width:94px;height:27px" name="pageSize" id="pageSize">
										<option style="height:25px" value="10">10</option>
										<option style="height:25px" value="50">50</option>
										<option style="height:25px" value="100">100</option>
									</select>
								</div>
								<label class="label_txt wid60 txtleft margl6 margt11">
									条记录 </label> <input id="saveSelectData" type="hidden"
									value='${sessionDetail }' name="saveSelectData">
							</div>
							<div id="div_table_page"
								class="chan_table_page_wrap wid620 margt10 paddr36">
								<div class="chan_table_page"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- 分页隐藏域 -->
			<input type="hidden" id="pageIndex" name="pageIndex" value="1"/>
			<input type="hidden" id="pageSize" name="pageSize" value="10" />
			<!-- // 分页隐藏域 -->
		</form>
	</div>
</body>
</html>