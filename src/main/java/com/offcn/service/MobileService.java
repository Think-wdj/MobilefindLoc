package com.offcn.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.bean.Mobile;



public interface MobileService {

	 //查询
		@GET
		@Path("/getBynum/{num}")
		@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
		public Mobile get(@PathParam("num") String num);
}
