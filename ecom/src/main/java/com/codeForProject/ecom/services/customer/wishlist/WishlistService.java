package com.codeForProject.ecom.services.customer.wishlist;

import com.codeForProject.ecom.dto.WishlistDto;

import java.util.List;

public interface WishlistService {

    WishlistDto addProductToWishlist(WishlistDto wishlistDto);

    List<WishlistDto> getWishlistByUserId(Long userId);

}
