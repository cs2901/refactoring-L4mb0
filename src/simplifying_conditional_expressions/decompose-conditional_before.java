
    if (date.notSummer()) {
      charge = quantity * winterRate + winterServiceCharge;
    }
    else {
      charge = quantity * summerRate;
    }