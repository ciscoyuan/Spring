//package com.finals.api.service;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//import com.finals.acc.model.AccBase;
//import com.finals.acc.model.AccBaseExample;
//import com.finals.common.db.template.BaseService;
//
///**
// * AccBase Service接口
// * @author auto generate v1.0
// * @version 1.0, 2017/12/10
// */
//@Path("ccc")
//@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
//@Consumes
//public interface AccBaseService extends BaseService<AccBase, AccBaseExample> {
//
//	@GET
//	@Path("{key}")
//	AccBase testApi(@PathParam("key") Long key);
//}