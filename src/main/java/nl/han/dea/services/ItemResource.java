package nl.han.dea.services;

import nl.han.dea.services.dto.ItemDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/items")
public class ItemResource {
    private ItemService itemService;

    public ItemResource() {
        this.itemService = new ItemService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ItemDTO> getJsonItems() {
        return itemService.getAll();
    }
}
