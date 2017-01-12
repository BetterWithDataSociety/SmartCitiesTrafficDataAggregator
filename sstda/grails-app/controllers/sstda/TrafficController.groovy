package sstda

import grails.plugin.springsecurity.annotation.Secured
import grails.converters.JSON


class TrafficController {

  @Secured(['ROLE_USER', 'IS_AUTHENTICATED_FULLY'])
  def index() { 

    log.debug("TrafficController::index");

    def result = [ result:'OK' ]

    if ( request.method == 'POST' ) {
      render result as JSON
      log.debug("Handle post");
    }
    else {
      log.debug("Handle non POST");
      render result
    }

  }
}
