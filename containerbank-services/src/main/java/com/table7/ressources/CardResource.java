package com.table7.ressources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.table7.card.CardRepository;
import com.table7.model.Card;
import com.table7.model.CardType;

@RestController
public class CardResource {

	@Autowired
	private CardRepository repository;
	
	// get All Cards
	@RequestMapping("/cards")
	public List<Card> findAll(){
		final List<Card> customers = repository.findAll();
		return customers;
	}
	
	//Post Card
	@RequestMapping(value = "/cards" , method = RequestMethod.POST, consumes = {"application/json"})
	public void save(@RequestBody Card card){
		repository.save(card);
}
	 
	//Get card by id
	@RequestMapping(value = "/cards/{cardId}" , method = RequestMethod.GET)
	Card findCard(@PathVariable Integer id) {
		return repository.findById(id);
	}
			
	
	/*@GetMapping("/cards/{cardId}")
	Card one(@PathVariable Integer id) {

		return repository.findById(id);
			
	}*/

	
	
	//Put New Card
	@RequestMapping(value = "/cards/{cardId}" , method = RequestMethod.PUT)
     Card replaceCard (@PathVariable Integer id , @RequestBody Card newCard) {
		    newCard.setId(id);
			return repository.save(newCard);
				
	}
	
	// get All TypesCards
		/*@RequestMapping("/cardTypes")
		public List<cardType> findAllTypes(){
			final List<cardType> typesCards = repository.findAll();
			return typesCards;
		}
	*/

}
