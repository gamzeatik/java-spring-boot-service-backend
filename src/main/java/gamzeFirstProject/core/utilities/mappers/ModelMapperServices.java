package gamzeFirstProject.core.utilities.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMapperServices {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
