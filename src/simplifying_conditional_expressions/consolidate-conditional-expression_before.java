double disabilityAmount() {
    //(seniority < 2) || (monthsDisabled > 12) || (isPartTime)
  if (notElegible()) {
    return 0;
  }

  // Compute the disability amount.
  // ...
}