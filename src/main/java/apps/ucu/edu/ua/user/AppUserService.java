package apps.ucu.edu.ua.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppUserService {
    private AppUserRepository appUserRepository;
    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }
    public List<AppUser> getAppUsers(){
        return  appUserRepository.findAll();
    }

    public void addAppUser(AppUser user){
        if(appUserRepository.findByEmail(user.getEmail()).isEmpty()){
            appUserRepository.save(user);
        }
    }
}
