/*
 * Licensed to Prodevelop SL under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The Prodevelop SL licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 * For more information, contact:
 *
 *   Prodevelop, S.L.
 *   Pza. Don Juan de Villarrasa, 14 - 5
 *   46001 Valencia
 *   Spain
 *
 *   +34 963 510 612
 *   +34 963 510 968
 *   prode@prodevelop.es
 *   http://www.prodevelop.es
 * 
 * @author Alberto Romeu Carrasco http://www.albertoromeu.com
 */

package es.alrocar.poiproxy.servlet;

import java.util.ArrayList;

import es.alrocar.poiproxy.configuration.ParamEnum;

public class BrowseQueryServerResource extends BaseServerResource {

	private ArrayList<String> optParams;

	@Override
	public ArrayList<String> getOptionalParamsNames() {
		if (optParams == null) {
			optParams = new ArrayList<String>();
			optParams.add(ParamEnum.QUERY.name);
			optParams.add(ParamEnum.APIKEY.name);
			optParams.add(ParamEnum.FROMDATE.name);
			optParams.add(ParamEnum.TODATE.name);
			optParams.add(ParamEnum.LIMIT.name);
			optParams.add(ParamEnum.OFFSET.name);
		}

		return optParams;
	}

}
