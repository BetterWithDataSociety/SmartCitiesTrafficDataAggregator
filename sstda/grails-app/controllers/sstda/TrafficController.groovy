package sstda

class TrafficController {

  def index() { 
    if ( request.method == 'POST' ) {
      log.debug("Handle post");
    }
    else {
      log.debug("Handle non POST");
    }
  }
}
