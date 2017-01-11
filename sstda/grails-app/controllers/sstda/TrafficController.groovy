package sstda

import grails.plugin.springsecurity.annotation.Secured
import grails.converters.JSON


class TrafficController {

  @Secured(['ROLE_USER', 'IS_AUTHENTICATED_FULLY'])
  def index() { 
    if ( request.method == 'POST' ) {
      log.debug("Handle post");
    }
    else {
      log.debug("Handle non POST");
    }

    render [ result:'OK' ] as JSON
  }
}
