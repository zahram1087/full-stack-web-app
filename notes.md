

Different Possible RequestMapping

//    @RequestMapping("/capitalize")
//    public String capitalizeWords(@RequestParam (name = "name",required =false)String name){
//        return name.toUpperCase();
//        //go to: http://localhost:8080/capitalize?name=me
//
//    }

//    @RequestMapping("/capitalize/{wordsToCapitalize}")
//    public String capitalizeWords(@PathVariable()String wordsToCapitalize){
//        return  wordsToCapitalize.toUpperCase();
//    }

//    @GetMapping("/capitalize/{wordsToCapitalize}")
//    public String capitalizeWords(@PathVariable()String wordsToCapitalize, Model model){
//
//       model.addAttribute("wordsToCapitalize",wordsToCapitalize);
//
//       return wordsToCapitalize.toUpperCase();
//        //leaf passes the string all the way to the front end
//    }