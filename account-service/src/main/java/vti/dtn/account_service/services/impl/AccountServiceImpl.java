package vti.dtn.account_service.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vti.dtn.account_service.dto.AccountDTO;
import vti.dtn.account_service.entity.AccountEntity;
import vti.dtn.account_service.repository.AccountRepository;
import vti.dtn.account_service.services.AccountService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    // xử lý nghiệp vụ thực tế
    private final AccountRepository accountRepository;

    @Override
    public List<AccountDTO> getListAccounts() {
        List<AccountEntity> accountEntities = accountRepository.findAll();
        return accountEntities.stream()
                .map(accountEntity -> new AccountDTO(
                        accountEntity.getId(),
                        accountEntity.getUserName(),
                        accountEntity.getFirstName(),
                        accountEntity.getLastName(),
                        null,
                        null,
                        null))
                .toList();
    }
}
