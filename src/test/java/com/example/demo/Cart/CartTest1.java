//package com.example.demo.Cart;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//
//import java.security.Principal;
//import java.util.Date;
//import java.util.Optional;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.example.demo.Controller.cartController;
//import com.example.demo.Model.Cart;
//import com.example.demo.Model.CartItem;
//import com.example.demo.Model.Category;
//import com.example.demo.Model.Product;
//import com.example.demo.Model.User;
//import com.example.demo.Repository.CartRepository;
//import com.example.demo.Repository.ProductRepository;
//import com.example.demo.Repository.UserRepository;
//import com.example.demo.Service.CartService;
//import com.example.demo.payload.CartDto;
//import com.example.demo.payload.ItemRequest;
//
//
//
////@RunWith(SpringRunner.class)
////@AutoConfigureTestDatabase(replace=Replace.NONE)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@SpringBootTest
//
//public class CartTest1 {
//
////	@Autowired
//	private Product product1;
//
////	@Autowired
//	private Category category;
//
////	@Autowired
//	private Cart cart1;
//
////	@Autowired
//	private CartItem cit;
//	
//	@Autowired
//	private CartService cartservice;
//	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private CartRepository cartRepository;
//	
//	@Autowired
//	private ProductRepository productRepository;
//	
//	@Autowired
//	private cartController cartController;
//	
////	@Autowired
//	private Principal principal;
//	
////	@Autowired
//	private User user1;
//	
////	@Before(value = "")
////	public void setup() {
////		MockitoAnnotations.initMocks(this);
////	}
//	String mail1 = "a@a";
//	
//
//public CartDto cart;
//public User user;
//Date curr = new Date();	
//public Product product;
//public Category categ;
//static int id;
//static String mail;
////@BeforeEach
////void setUp() {
////cartService = mock(CartService.class);
////principal = mock(Principal.class);
////cartController = new cartController();
//////cartController.
////}
//
//@Test
//@Order(1)
//void testaddItem() {
//	
//	Optional<User> user = userRepository.findByEmail("a@a");
////	Product product = productRepository.getReferenceById(6);
//	ItemRequest item = new ItemRequest();
//	item.setProductId(6);
//	item.setQuantity(1);
//
////	System.out.println("Principal"+principal);
//	CartDto cart = cartservice.addItem(item, "a@a");
//	System.out.println("Cart "+cart.getCartId());
//	assertThat(cart.getUser().getEmail()).isEqualTo("a@a");
////CartDto addItem = this.cartservice.addItem(itemRequest, principal.getName());
//
////Creating User
//
////user = new UserDto("Himanshu","himmi@gmail","123","Hld", "GET","male",
////		curr, true,"1234567890");
////ResponseEntity<UserDto> u1 = usrController.createUser(user);
////id = u1.getBody().getUserId();
////mail = u1.getBody().getEmail();
////user.setUserId(id);
////user1 = new User();
////UserDto u1 = userService.create(user1);
////user1.setUserId(u1.getUserId());
////mail1 = user1.getEmail();
//////Creating Product
////
////System.out.println(" This is the product id for the newly saved/created product");
////product1 = new ProductDto("Gold","10Grm Gold coin", 59990, true, 12, true);
////categ = new CategoryDto(1, "electric");
////ProductDto p1 = productService.createProduct(product1, categ.getCategoryId());
////id = p1.getProductId();
////product1.setProductId(id);
////assertThat(p1.getProductName()).isEqualTo("Gold");
////System.out.println("product saved/created and is checked with id :"+id);
////
//////Adding product to the users cart.
////
////ItemRequest item = new ItemRequest(id,1);
//////item.setProductId(id);
//////item.setQuantity(1);
////System.out.println(item.getProductId()+" Product id");
////System.out.println(item.getQuantity()+" Product Quantity");
////
////System.out.println(mail1+" Mail id of the user");
//////System.out.println(cart.getUser().getEmail()+" Mail id of the user");
////cart1 = cartService.addItem(item, mail1);
////assertThat(cart1.getUser().getEmail()).isEqualTo(user1.getEmail());
//////assertThat(cart.getIteam())
//////assertThat(cart.getIteam()).isEqualTo(item);
//////assertThat(actRes.get().getEmail()).isEqualTo("himmi@gmail");
//////ResponseEntity<CartDto> res = new cartController().addItem(item, principal);
//////assertEquals(res.,);
//////CartDto cart1 = new CartDto();
//////when(cartService.addItem(item, principal.getName())).thenReturn(cart1);
////
//////ResponseEntity<CartDto> res = new cartController().addItem(item, principal);
//////
//////assertEquals(HttpStatus.OK, res.getStatusCode());
////
//////removing product from cart
////cartService.removeCartItem(mail1, id);
////categ.
////
////int res = productService.deleteProduct(id);
////assertThat(res).isEqualTo(0);
////System.out.println(" product deleted for id: "+id);	
////userService.delete(user1.getUserId());
////Optional<User> actRes = userRepository.findByEmail(mail1);
////assertThat(actRes).isEmpty();	
////System.out.println("user with mail id delete"+mail1);
//}
//
//
//}