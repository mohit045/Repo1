$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/EndToEndTest.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer place order",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.he_search_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.choose_to_buy_the_first_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.moves_to_checkout_from_mini_cart()"
});
formatter.result({
  "status": "passed"
});
});